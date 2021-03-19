package edu.itesm.stanley

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_pokemones.*


/**
 * A simple [Fragment] subclass.
 * Use the [PokemonesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PokemonesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pokemones, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        pokemones_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = PokemonesAdapter(createData())
        }
    }

    fun createData(): ArrayList<Pokemon>{
        val pokemones = ArrayList<Pokemon>()
        pokemones.add(Pokemon(R.drawable.pikachu,"Pikachu", "Eléctrico","Cuanto más potente es la energía eléctrica que genera este Pokémon, más suaves y elásticas se vuelven las bolsas de sus mejillas.", "Habilidad: Electricidad Estática"))
        pokemones.add(Pokemon(R.drawable.charmander, "Charmander", "Fuego", "Prefiere las cosas calientes. Dicen que cuando llueve le sale vapor de la punta de la cola.", "Habilidad: Mar Llamas"))
        pokemones.add(Pokemon(R.drawable.bulbasaur, "Bulbasaur", "Planta & Veneno", "Este Pokémon nace con una semilla en el lomo, que brota con el paso del tiempo.", "Habilidad: Espesura"))
        pokemones.add(Pokemon(R.drawable.squirtle, "Squirtle", "Agua", "Cuando retrae su largo cuello en el caparazón, dispara agua a una presión increíble.", "Habilidad: Torrente"))
        pokemones.add(Pokemon(R.drawable.vulpix, "Vulpix", "Fuego", "De pequeño, tiene seis colas de gran belleza. A medida que crece, le van saliendo más.", "Habilidad: Absorbe Fuego"))
        pokemones.add(Pokemon(R.drawable.jigglypuff, "Jigglypuff", "Normal & Hada", "Su capacidad pulmonar es excepcional, incluso para un Pokémon. Es capaz de cantar nanas sin cesar hasta que su rival se duerma.", "Habilidad: Gran Encanto"))
        pokemones.add(Pokemon(R.drawable.psyduck, "Psyduck", "Agua", "Siempre padece dolores de cabeza. Tras desatar sus misteriosos poderes, la jaqueca remite unos instantes.", "Habilidad: Humedad"))
        pokemones.add(Pokemon(R.drawable.growlithe, "Growlithe", "Fuego", "De naturaleza valiente y honrada, se enfrenta sin miedo a enemigos más grandes y fuertes.", "Habilidad: Intimidación"))
        pokemones.add(Pokemon(R.drawable.ponyta, "Ponyta", "Fuego", "Al nacer es un poco lento, pero va fortaleciendo las patas paulatinamente al disputar carreras con sus congéneres.", "Habilidad: Fuga"))
        pokemones.add(Pokemon(R.drawable.gastly, "Gastly", "Fantasma & Veneno", "Nació a partir de gases venenosos que asfixiarían a cualquiera que se viera envuelto en ellos.", "Habilidad: Levitación"))
        pokemones.add(Pokemon(R.drawable.cubone, "Cubone", "Tierra", "Cuando llora al acordarse de su madre fallecida, su llanto resuena en el cráneo que lleva en la cabeza.", "Habilidad: Cabeza Roca"))
        pokemones.add(Pokemon(R.drawable.eevee, "Eevee", "Normal", "Es capaz de alterar la composición de su cuerpo para adaptarse al entorno.", "Habilidad: Adaptable"))
        pokemones.add(Pokemon(R.drawable.vaporeon, "Vaporeon", "Agua", "Cuando las aletas de Vaporeon comienzan a vibrar, significa que lloverá en las próximas horas.", "Habilidad: Absorbe Agua"))
        pokemones.add(Pokemon(R.drawable.jolteon, "Jolteon", "Eléctrico", "Si se enfada o asusta, se le eriza el pelaje. Cada uno de sus pelos se convierte en una afilada púa que hace trizas al rival.", "Habilidad: Absorbe Electricidad"))
        pokemones.add(Pokemon(R.drawable.flareon, "Flareon", "Fuego", "Una vez que ha almacenado el calor suficiente, puede alcanzar una temperatura de 900 ºC.", "Habilidad: Absorbe Fuego"))

        return pokemones
    }
}