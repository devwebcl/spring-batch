package cl.devweb.model.decorator;

import cl.devweb.model.citydeal.UserCD;
import cl.devweb.model.devwebish.UserPivot;

public class UserDecorator {

    private UserPivot userPivot;
    private UserCD userCD;
    private String operation;

    public UserDecorator(UserPivot userPivot, UserCD userCD) {
        this.userPivot = userPivot;
        this.userCD = userCD;
    }

    public UserPivot getUserPivot() {
        return userPivot;
    }

    public void setUserPivot(UserPivot userPivot) {
        this.userPivot = userPivot;
    }

    public UserCD getUserCD() {
        return userCD;
    }

    public void setUserCD(UserCD userCD) {
        this.userCD = userCD;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
