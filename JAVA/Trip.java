package JAVA;

public class Trip {
    
    private Integer id;
    private User user;
    private Car car;
    private Route route;
    private Double amount;
    private Payment payment;
    private Double progress;
    private Boolean completed;

    public Trip(User user, Route route, Payment payment) {
        this.user = user;
        this.route = route;
        this.payment = payment;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    public Route getRoute() {
        return route;
    }
    public void setRoute(Route route) {
        this.route = route;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public Payment getPayment() {
        return payment;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    public Double getProgress() {
        return progress;
    }
    public void setProgress(Double progress) {
        this.progress = progress;
    }
    public Boolean getCompleted() {
        return completed;
    }
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

}
