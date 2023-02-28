package data;

public class Member {
  private String id;
  private String name;
  private String password;

  public Member(String id, String name, String password) {
    this.id = id;
    this.name = name;
    this.password = password;
  }
  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }
}
