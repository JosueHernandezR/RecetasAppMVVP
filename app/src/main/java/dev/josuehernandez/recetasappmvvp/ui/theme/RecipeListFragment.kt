package dev.josuehernandez.recetasappmvvp.ui.theme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.activity.result.ActivityResultCaller
import androidx.fragment.app.commit
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class RecipeListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_recipe_list, container, false
        )
        view.findViewById<ComposeView>(R.id.compose_view).setContent {
            Column(
                modifier = Modifier
                    .border(border = BorderStroke(1.dp, Color.Black))
                    .padding(16.dp)
            ) {

                Text("THIS IS A COMPOSABLE INSIDE THE FRAGMENT XML")
                Spacer(modifier = Modifier.padding(10.dp))
                CircularProgressIndicator()
                Spacer(modifier = Modifier.padding(10.dp))
                Text("NEAT")
                Spacer(modifier = Modifier.padding(10.dp))

                val customView = HorizontalDottedProgress(ContextAmbient.current)
                AndroidView(viewBlock = { customView })
            }
        }

        return view
    }
}