package masterous.si6a.kontak.loaders;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import java.util.List;

import masterous.si6a.kontak.db.User;
import masterous.si6a.kontak.db.UserDatabase;

public class GetDataLoader extends AsyncTaskLoader<List<User>> {
    private UserDatabase db;

    public GetDataLoader(@NonNull Context context) {
        super(context);
        db = UserDatabase.getInstance(context);
    }

    @Nullable
    @Override
    public List<User> loadInBackground() {
        return db.userDao().getAllUsers();
    }
}
