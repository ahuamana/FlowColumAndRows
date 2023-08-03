package com.ahuaman.flowrowandflowcolum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ahuaman.flowrowandflowcolum.ui.theme.FlowRowAndFlowColumTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlowRowAndFlowColumTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}



@OptIn(ExperimentalLayoutApi::class)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FlowRowAndFlowColumTheme {
        FlowRow(
            modifier = Modifier
                .padding(4.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(0.dp),
            maxItemsInEachRow = 4,
        ) {

            NewMenu(
                text = "Sandwiches"
            )
            NewMenu(
                text = "Chicken"
            )
            NewMenu(
                text = "Fruits"
            )
            NewMenu(
                text = "Chinese"
            )
        }
    }
}


@Composable
fun NewMenu(
    text:String
) {
    Card(modifier = Modifier.padding(4.dp)) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = text
        )
    }
}


@Composable
fun NewNotes(
    modifier: Modifier = Modifier,
    description:String,
    title: String
) {
    Card(
        modifier = modifier.padding(4.dp), // padding outside
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = title)
            Spacer(modifier = Modifier.padding(8.dp))
            Text(text = description)
        }

    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun NewNotesPreview() {
    FlowRowAndFlowColumTheme {
        FlowColumn(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth().fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            maxItemsInEachColumn = 10,
        ) {
            NewNotes(
                modifier = Modifier,
                description = "Today is a good day",
                title = "Title new premium"
            )

            NewNotes(
                modifier = Modifier,
                description = "I am happy today, I want to go to the beach and work with my laptop",
                title = "My notes"
            )

            NewNotes(
                modifier = Modifier,
                description = "Today is a good day",
                title = "Title new premium"
            )


            NewNotes(
                modifier = Modifier,
                description = "I am happy today",
                title = "My notes"
            )

            NewNotes(
                modifier = Modifier,
                description = "Today is a good day",
                title = "Title new premium"
            )

            NewNotes(
                modifier = Modifier,
                description = "I am happy today",
                title = "My noteaas"
            )

            NewNotes(
                modifier = Modifier,
                description = "I am happy today",
                title = "My noteaas"
            )

            NewNotes(
                modifier = Modifier,
                description = "I am happy today",
                title = "My noteaas"
            )

            NewNotes(
                modifier = Modifier,
                description = "I am happy today",
                title = "My noteaas"
            )


            NewNotes(
                modifier = Modifier,
                description = "I am happy today",
                title = "My noteaas"
            )

            NewNotes(
                modifier = Modifier,
                description = "I am happy today",
                title = "My noteaas"
            )

        }

    }
}