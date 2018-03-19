package example.android.com.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_main.*
import org.jetbrains.anko.intentFor


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val villeAdapter = VilleAdapter(this,loadData())
        listView.adapter=villeAdapter
        listView.setOnItemClickListener { adapterView, view, i, l ->
            val ville= villeAdapter.getItem(i)
            if (isTwoPane()) {

                val villeTitre = findViewById<TextView>(R.id.titre) as TextView
                val villeDescription = findViewById<TextView>(R.id.description) as TextView
                val villeTouriste = findViewById<TextView>(R.id.textView5) as TextView
                val villeLieux = findViewById<TextView>(R.id.textView7) as TextView
                val villeImg= findViewById<ImageView>(R.id.imageView) as ImageView
                villeTitre.text=ville.title
                villeDescription.text=ville.description
                villeTouriste.text=ville.touriste
                villeLieux.text=ville.lieu
                villeImg.setImageResource(ville.image)

            }
            else {


                val intent = Intent(this,Main2Activity::class.java)
                intent.putExtra("ville", ville )
                startActivity(intent);

            }

        }

    }

    fun loadData():List<Ville> {
        val list = mutableListOf<Ville>()

            list.add(Ville("Sydney", R.drawable.sydney,"Le nombre moyen de touristes par an c'est: 800 ","Sidney est une ville de l'île de Vancouver, en Colombie-Britannique, au Canada.\n" +
                    "\n" +
                    "Portail de la Colombie-Britannique Po","Opera,Jardin d'essai","sydney.jpg"));
            list.add(Ville("Venise", R.drawable.venise,"Le nombre moyen de touristes par an c'est: 650 ","Sidney est une ville de l'île de Vancouver, en Colombie-Britannique, au Canada.\n" +
                    "\n" +
                    "Portail de la Colombie-Britannique Po","Opera,Jardin d'essai","venise.jpg"));
            list.add(Ville("Paris", R.drawable.paris,"Le nombre moyen de touristes par an c'est: 440 ","Sidney est une ville de l'île de Vancouver, en Colombie-Britannique, au Canada.\n" +
                    "\n" +
                    "Portail de la Colombie-Britannique Po","Opera,Jardin d'essai","paris.jpg"));
            list.add(Ville("Dubai", R.drawable.dubai,"Le nombre moyen de touristes par an c'est: 850 ","Sidney est une ville de l'île de Vancouver, en Colombie-Britannique, au Canada.\n" +
                    "\n" +
                    "Portail de la Colombie-Britannique Po","Opera,Jardin d'essai","dubai.jpg"));
            list.add(Ville("Kuala Lampur", R.drawable.kualalumpur,"Le nombre moyen de touristes par an c'est: 700 ","Sidney est une ville de l'île de Vancouver, en Colombie-Britannique, au Canada.\n" +
                    "\n" +
                    "Portail de la Colombie-Britannique Po","Opera,Jardin d'essai","kualalumpur.jpg"));
            list.add(Ville("Londres", R.drawable.londres,"Le nombre moyen de touristes par an c'est: 500 ","Sidney est une ville de l'île de Vancouver, en Colombie-Britannique, au Canada.\n" +
                    "\n" +
                    "Portail de la Colombie-Britannique Po","Opera,Jardin d'essai","londres.jpg"));
            list.add(Ville("Taiwan", R.drawable.taiwan,"Le nombre moyen de touristes par an c'est: 390 ","Sidney est une ville de l'île de Vancouver, en Colombie-Britannique, au Canada.\n" +
                    "\n" +
                    "Portail de la Colombie-Britannique Po","Opera,Jardin d'essai","taiwan.jpg"));


        return list

    }

    fun isTwoPane() =findViewById<View>(R.id.fragment2)!= null
}