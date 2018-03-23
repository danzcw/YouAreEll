import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Id {

    private String id;
    private String name;
    private String github;


    public Id(String id, String name, String github) {
        this.id = id;
        this.name = name;
        this.github = github;
    }

    public Id(String name, String github) {
        this.name = name;
        this.github = github;
    }

    public String getUserid() {
        return id;
    }

    public void setUserid(String userid) {
        this.id = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", github='" + github + '\'' +
                '}';
    }
}