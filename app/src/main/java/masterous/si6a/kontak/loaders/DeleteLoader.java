package masterous.si6a.kontak.loaders;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import masterous.si6a.kontak.db.UserDatabase;

public class DeleteLoader extends AsyncTaskLoader<Integer> {
    private int userId;
    private UserDatabase db;

    public DeleteLoader(@NonNull Context context, int userId) {
        super(context);
        this.userId = userId;
        db = UserDatabase.getInstance(context);
    }

    @Nullable
    @Override
    public Integer loadInBackground() {
        return db.userDao().deleteUser(userId);
    }
}
