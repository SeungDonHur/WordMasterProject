package com.mycom.word;
// CRUD기능을 구현하기 위한 Interface 입니다.
public interface ICRUD {
    public Object add();
    public int update(Object obj);
    public int delete(Object obj);
    public void selectOne(int id);
}
