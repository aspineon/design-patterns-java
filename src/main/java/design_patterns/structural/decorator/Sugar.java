package design_patterns.structural.decorator;

class Sugar extends CoffeeDecorator {
    public Sugar(Coffee decorator) {
        super(decorator);
    }

    public String getIngredients() {
        return super.getIngredients() + ", " + "Sugar";
    }
}
