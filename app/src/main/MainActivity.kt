import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.text.TextField
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.immortalweeds.pedometer.ui.theme.PedometerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PedometerTheme {
                // Replace with your Compose content
                Greeting("Android")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    TextField(
        value = "Hello, $name!",
        onValueChange = { /*TODO*/ },
        label = { Text("Greeting") }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PedometerTheme {
        Greeting("Android")
    }
}
