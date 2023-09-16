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


@Preview(showBackground = true)
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowRowTestingUI() {
    FlowRow() {
        MenuItem(
            title = "Sandwiches"
        )
        MenuItem(
            title = "Chicken"
        )
        MenuItem(
            title = "Fruits"
        )
        MenuItem(
            title = "Chinese"
        )
        MenuItem(
            title = "Sandwiches"
        )
    }
}



@Composable
fun MenuItem(title:String) {
    Card(modifier = Modifier.padding(4.dp)) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = title
        )
    }
}


//Now Flow Colum testing
@OptIn(ExperimentalLayoutApi::class)
@Preview(showBackground = true)
@Composable
fun FlowColumUITesting() {
    FlowColumn {
        MenuItem(
            title = "Sandwiches"
        )
        MenuItem(
            title = "Chicken"
        )
        MenuItem(
            title = "Fruits"
        )
        MenuItem(
            title = "Chinese"
        )
        MenuItem(
            title = "Sandwiches"
        )
    }
}

