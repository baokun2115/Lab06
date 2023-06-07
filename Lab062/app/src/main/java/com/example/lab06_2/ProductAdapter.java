package com.example.lab06_2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    private List<Product> productList;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView productImageView;
        public TextView productTextView;
        // Other views in item_product.xml

        public ViewHolder(View view) {
            super(view);
            productImageView = view.findViewById(R.id.productImageView);
            // Initialize other views
            productTextView = view.findViewById(R.id.productNameTextView);
        }
    }

    public ProductAdapter(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_item, parent, false);
        return new ViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Product product = productList.get(position);
        holder.productImageView.setImageResource(product.getImgResourceId());
        holder.productTextView.setText(product.getName());
        // Bind other product details to the views
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}
