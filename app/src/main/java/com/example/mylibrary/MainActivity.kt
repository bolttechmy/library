package com.example.mylibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mylibrary.ui.theme.MyLibraryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLibraryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HelloWorld("Android")
                }
            }
        }
    }
}

@Composable
fun HelloWorld(name: String) {
    Column {
        Text(text = "Hello $name!")
        Text(text = "Hello World!")
        Text(text = "Hello Anand!")
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyLibraryTheme {
        HelloWorld("Android")
    }
}