package libraryManagementByArrayList;

import java.util.Date;

public class LoanCard extends Student{
    private String id;
    private Date loanDay;
    private Date payDay;
    private String idBook;

    public LoanCard(String name, int age, int grade, String id, Date loanDay, Date payDay, String idBook) {
        super(name, age, grade);
        this.id = id;
        this.loanDay = loanDay;
        this.payDay = payDay;
        this.idBook = idBook;
    }

    public LoanCard() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getLoanDay() {
        return loanDay;
    }

    public void setLoanDay(Date loanDay) {
        this.loanDay = loanDay;
    }

    public Date getPayDay() {
        return payDay;
    }

    public void setPayDay(Date payDay) {
        this.payDay = payDay;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    @Override
    public String toString() {
        return "LoanCard{" +
                "id='" + id + '\'' +
                ", loanDay=" + loanDay +
                ", payDay=" + payDay +
                ", idBook='" + idBook + '\'' +
                '}';
    }
}
