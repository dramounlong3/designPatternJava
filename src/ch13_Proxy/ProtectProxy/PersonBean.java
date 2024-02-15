package src.ch13_Proxy.ProtectProxy;

public class PersonBean implements Person{

    private String name;
    private Integer likeCount;

    //
    @Override
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    @Override
    public Integer getLikeCount() {
        return likeCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
