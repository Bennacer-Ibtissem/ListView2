package example.android.com.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import example.android.com.myapplication.R
import kotlinx.android.synthetic.main.activity_main2.*
import android.graphics.drawable.Drawable



class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val villeTitre = findViewById<TextView>(R.id.titre) as TextView
        val villeDescription = findViewById<TextView>(R.id.description) as TextView
        val villeTouriste = findViewById<TextView>(R.id.textView5) as TextView
        val villeLieux = findViewById<TextView>(R.id.textView7) as TextView
        val villeImg= findViewById<ImageView>(R.id.imageView) as ImageView
        val ville= intent.getSerializableExtra("ville") as Ville
      villeTitre.text=ville.title
      villeDescription.text=ville.description
      villeTouriste.text=ville.touriste
      villeLieux.text=ville.lieu
        villeImg.setImageResource(ville.image)
    }
}
