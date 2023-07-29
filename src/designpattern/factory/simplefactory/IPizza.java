package designpattern.factory.simplefactory;

public interface IPizza {

    public void setPizzaIngredient(String content);

    public void prepare();

    public void bake();

    public void cut();

    public void box();
}
