package codingcafe.example.macrotechnology_cusomer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;



    public class CategoryAdapter  extends RecyclerView.Adapter<codingcafe.example.macrotechnology_cusomer.CategoryAdapter.CategoryViewHolder> {

        private Context mCtx;
        private List<Category> categorytList;

        public CategoryAdapter(Context mCtx, List<Category> categoryList) {
            this.mCtx = mCtx;
            this.categorytList = categoryList;
        }


        @Override
        public codingcafe.example.macrotechnology_cusomer.CategoryAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater=LayoutInflater.from(mCtx);
            View view=inflater.inflate(R.layout.category_item_layout,null);
            codingcafe.example.macrotechnology_cusomer.CategoryAdapter.CategoryViewHolder holder=new codingcafe.example.macrotechnology_cusomer.CategoryAdapter.CategoryViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull codingcafe.example.macrotechnology_cusomer.CategoryAdapter.CategoryViewHolder holder, int position) {
            Category category=categorytList.get(position);
            holder.text_category.setText(category.getName());


        }

        @Override
        public int getItemCount() {
            return categorytList.size();
        }

        class CategoryViewHolder extends RecyclerView.ViewHolder{


            TextView text_category;
            public CategoryViewHolder (View itemView){
                super(itemView);


                text_category=itemView.findViewById(R.id.text_category);




            }


        }


    }

