package masterous.si6a.kontak;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import masterous.si6a.kontak.db.User;

public class KontakViewAdapter extends RecyclerView.Adapter<KontakViewAdapter.ViewHolder> {
    private List<User> data = new ArrayList<>();

    @NonNull
    @Override
    public KontakViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull KontakViewAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
                
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
