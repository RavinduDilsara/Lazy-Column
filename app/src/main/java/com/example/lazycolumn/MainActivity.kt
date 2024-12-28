package com.example.lazycolumn


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val messageList = listOf(
                Message("User1", "Good Morning"),
                Message("User2", "Please call me back whenever You are free"),
                Message("User3", "How is your day"),
                Message("User4", "What is going on brother "),
                Message("User5", "How are you"),
                Message("user6", "Good Evening"),
                Message("User7", "Good Morning"),
                Message("User8", "Please call me back"),
                Message("User9", "How is your day"),
                Message("User10", "What is going on "),
                Message("Use11", "How are you"),
                Message("user12", "Enjoy your day"),
                Message("User13", "Good Morning"),
                Message("Use14", "Please can you do me a favour"),
                Message("User15", "How is your day"),
                Message("User16", "What is going on "),
                Message("User17", "How are you"),
                Message("user18", "Good Evening"),

                )
            MessageList(messageList)
        }
    }
}

@Composable
fun MessageList(messages: List<Message>) {

    LazyColumn {
        items(messages) {

                message ->
            MessageCard(message)
        }

    }
}

data class Message(val name: String, val messageDetails: String)

@Composable
fun MessageCard(message: Message) {

    Row(
        modifier = Modifier.padding(all = 5.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            painter = painterResource(R.drawable.image1),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(10.dp))

        Column {

            Text(
                text = message.name,
                style = MaterialTheme.typography.titleMedium
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = message.messageDetails,
                style = MaterialTheme.typography.titleSmall,
                color = MaterialTheme.colorScheme.secondary
            )
        }
    }

}