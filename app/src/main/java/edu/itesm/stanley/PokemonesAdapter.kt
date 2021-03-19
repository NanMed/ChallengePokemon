package edu.itesm.stanley

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class PokemonesAdapter(private val movies : List<Pokemon>)
    : RecyclerView.Adapter<PokemonesAdapter.PokemonViewHolder>(){

    inner class PokemonViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var nombre = renglon.findViewById<TextView>(R.id.nombre)
        var tipo = renglon.findViewById<TextView>(R.id.tipo)
        var descripcion = renglon.findViewById<TextView>(R.id.descripcion)
        var foto = renglon.findViewById<ImageView>(R.id.foto)
    }

    //Crea el renglón
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.pokemones_renglon,parent, false)
        return PokemonViewHolder(renglon_vista)
    }

    //Asocia datos con los elementos del renglón
    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val pokemon = movies[position]
        holder.foto.setImageResource(pokemon.picture)
        holder.nombre.text = pokemon.nombre
        holder.tipo.text = pokemon.tipo
        holder.descripcion.text = pokemon.descripcion
        holder.itemView.setOnClickListener {
            val action = PokemonesFragmentDirections.actionPokemonesFragmentToPokemonFragment(pokemon)
            holder.itemView.findNavController().navigate(action)
            Toast.makeText(holder.itemView.context,"${pokemon.secreto}",Toast.LENGTH_SHORT).show();
        }
    }

    // Cuantos elementos tiene la lista
    override fun getItemCount(): Int {
        return movies.size
    }
}