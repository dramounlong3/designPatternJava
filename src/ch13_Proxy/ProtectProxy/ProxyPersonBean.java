package src.ch13_Proxy.ProtectProxy;

public class ProxyPersonBean implements Person{

    PersonBean personBean;

    public ProxyPersonBean(PersonBean personBean) {
        this.personBean = personBean;
    }

    /**
     * 基於某些原因, 保護PersonBean.likeCount 不能被修改
     * @param like
     */
    @Override
    public void setLikeCount(Integer like) {
        System.out.println("透過保護代理時, 無權限修改like數");
    }

    @Override
    public Integer getLikeCount() {
        return this.personBean.getLikeCount();
    }

    @Override
    public void setName(String name) {
        this.personBean.setName(name);
    }

    @Override
    public String getName() {
        return this.personBean.getName();
    }
}
