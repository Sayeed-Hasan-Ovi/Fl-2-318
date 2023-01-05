import java.util.Arrays;

public class Variable {
    private int row;
    private int column;
    private int value;
    private int domainSize;
    private int[] domain;

    public Variable(int row, int column, int domainSize) {
        this.row = row;
        this.column = column;
        this.domainSize = domainSize;
        this.domain = new int[domainSize];
        for (int i = 0; i < domainSize; i++) {
            domain[i] = i + 1;
        }
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getValue() {
        return value;
    }

    public int getDomainSize() {
        return domainSize;
    }

    public int[] getDomain() {
        return domain;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setDomainSize(int domainSize) {
        this.domainSize = domainSize;
    }

    public void setDomain(int[] domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return "Variable{" +
                "row=" + row +
                ", column=" + column +
                ", domainSize=" + domainSize +
                ", domain=" + Arrays.toString(domain) +
                '}';
    }
}
