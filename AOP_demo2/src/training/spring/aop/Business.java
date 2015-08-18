package training.spring.aop;

import training.spring.schemaAOP.User_Exception;

public interface Business {
    void doBusiness();
    public String getName(String name);
    public void testBusinessException(String name) throws User_Exception;
}
