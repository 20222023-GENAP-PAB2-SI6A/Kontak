package masterous.si6a.kontak.loaders;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import masterous.si6a.kontak.db.User;
import masterous.si6a.kontak.db.UserDatabase;

public class UpdateDataLoader extends AsyncTaskLoader<Integer> {
    private User user;
    private UserDatabase db;

    public UpdateDataLoader(@NonNull Context context, User user) {
        super(context);
        this.user = user;
        db = UserDatabase.getInstance(context);
    }

    @Nullable
    @Override
    public Integer loadInBackground() {
        return db.userDao().updateUser(user);
    }
}
