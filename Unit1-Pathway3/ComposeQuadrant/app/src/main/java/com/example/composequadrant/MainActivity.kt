package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Quadrant(
                        stringResource(R.string.text_composable),
                        stringResource(R.string.text_description),
                        stringResource(R.string.image_composable),
                        stringResource(R.string.image_description),
                        stringResource(R.string.row_composable),
                        stringResource(R.string.row_description),
                        stringResource(R.string.column_composable),
                        stringResource(R.string.column_description),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Quadrant(
    QuadrantI: String,
    QuadrantIDescription: String,
    QuadrantII: String,
    QuadrantIIDescription: String,
    QuadrantIII: String,
    QuadrantIIIDescription: String,
    QuadrantIV: String,
    QuadrantIVDescription: String,
    modifier: Modifier
) {

    Column(
        modifier = modifier.fillMaxSize(),
    ) {
        Row(
            modifier = Modifier.weight(0.5f),
        ) {
            Box(
                modifier = Modifier
                    .background(colorResource(R.color.light))
                    .weight(0.5f)
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxSize(),
                    verticalArrangement = Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = QuadrantI,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                    Text(
                        text = QuadrantIDescription,
                        textAlign = TextAlign.Justify
                    )
                }
            }
            Box(
                modifier = Modifier
                    .weight(0.5f)
                    .fillMaxSize()
                    .background(colorResource(R.color.purple_light))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = QuadrantII,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                    Text(
                        text = QuadrantIIDescription,
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }
        Row(
            modifier = Modifier.weight(0.5f),
        ) {

            Box(

                modifier = Modifier
                    .weight(0.5f)
                    .fillMaxSize()
                    .background(colorResource(R.color.purple_dark))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Center,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Text(
                        text = QuadrantIII,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                    Text(
                        text = QuadrantIIIDescription,
                        textAlign = TextAlign.Justify
                    )
                }
            }
            Box(
                modifier = Modifier.weight(0.5f)
                .fillMaxSize()
                .background(colorResource(R.color.light2)),

            ) {
                Column(
                    modifier = Modifier.fillMaxSize().padding(16.dp),
                    verticalArrangement = Center,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Text(
                        text = QuadrantIV,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                    Text(
                        text = QuadrantIVDescription,
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "Quadrant")
@Composable
fun QuadrantPreview() {
    ComposeQuadrantTheme {
        Quadrant(
            stringResource(R.string.text_composable),
            stringResource(R.string.text_description),
            stringResource(R.string.image_composable),
            stringResource(R.string.image_description),
            stringResource(R.string.row_composable),
            stringResource(R.string.row_description),
            stringResource(R.string.column_composable),
            stringResource(R.string.column_description),
            modifier = Modifier.padding()
        )
    }
}