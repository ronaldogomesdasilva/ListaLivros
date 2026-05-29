package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class AdpterLivros extends RecyclerView.Adapter<AdpterLivros.ViewHolder> {

    private Context context;
    private List<Livros> lstLivros;

    public AdpterLivros(Context context, List<Livros> lstLivros) {
        this.context = context;
        this.lstLivros = lstLivros;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_livros, parent, false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.modeloTitulolivro.setText(lstLivros.get(position).getTitulo());
    holder.modeloImgLivros.setImageResource(lstLivros.get(position).getImgLivro());

    }

    @Override
    public int getItemCount() {
        return lstLivros.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView modeloCardLivros;
        ImageView modeloImgLivros;
        TextView modeloTitulolivro;


        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            modeloTitulolivro = itemView.findViewById(R.id.modeloTitulolivro);
            modeloCardLivros = itemView.findViewById(R.id.modeloCardLivros);
            modeloImgLivros = itemView.findViewById(R.id.modeloImgLivros);

        }
    }
}
