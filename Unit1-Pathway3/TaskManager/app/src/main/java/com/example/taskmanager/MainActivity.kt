package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.taskmanager.ui.theme.TaskManagerTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskManagerTheme {
                TaskManagerApp(
                    message = stringResource(R.string.task_completed),
                    appreciation = stringResource(R.string.appreciation),
                )
            }
        }
    }
}

@Composable
fun TaskManagerApp(message: String, appreciation: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Center,
        horizontalAlignment = CenterHorizontally

        ) {
        Image(
            painter = painterResource(R.drawable.ic_task_completed),
            contentDescription = null,
        )
        Text(
            text = message,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = appreciation,
            modifier = Modifier.padding(16.dp)
        )
    }
}


@Preview(showBackground = true, showSystemUi = true, name = "TaskManager")
@Composable
fun TaskManagerAppPreview() {
    TaskManagerTheme {
        TaskManagerApp(
            message = stringResource(R.string.task_completed),
            appreciation = stringResource(R.string.appreciation),
        )
    }
}