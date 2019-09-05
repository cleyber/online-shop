package entity;

import java.math.BigDecimal;

public class Product extends Entity{
    private BigDecimal value;
    private int status;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
