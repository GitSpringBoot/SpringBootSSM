package com.boot.entity;

public class Foods {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tra_foods.food_id
     *
     * @mbggenerated Thu May 03 20:24:11 CST 2018
     */
    private Integer foodId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tra_foods.food_name
     *
     * @mbggenerated Thu May 03 20:24:11 CST 2018
     */
    private String foodName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tra_foods.food_price
     *
     * @mbggenerated Thu May 03 20:24:11 CST 2018
     */
    private Integer foodPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tra_foods.food_message
     *
     * @mbggenerated Thu May 03 20:24:11 CST 2018
     */
    private String foodMessage;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tra_foods.food_id
     *
     * @return the value of tra_foods.food_id
     *
     * @mbggenerated Thu May 03 20:24:11 CST 2018
     */
    public Integer getFoodId() {
        return foodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tra_foods.food_id
     *
     * @param foodId the value for tra_foods.food_id
     *
     * @mbggenerated Thu May 03 20:24:11 CST 2018
     */
    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tra_foods.food_name
     *
     * @return the value of tra_foods.food_name
     *
     * @mbggenerated Thu May 03 20:24:11 CST 2018
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tra_foods.food_name
     *
     * @param foodName the value for tra_foods.food_name
     *
     * @mbggenerated Thu May 03 20:24:11 CST 2018
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tra_foods.food_price
     *
     * @return the value of tra_foods.food_price
     *
     * @mbggenerated Thu May 03 20:24:11 CST 2018
     */
    public Integer getFoodPrice() {
        return foodPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tra_foods.food_price
     *
     * @param foodPrice the value for tra_foods.food_price
     *
     * @mbggenerated Thu May 03 20:24:11 CST 2018
     */
    public void setFoodPrice(Integer foodPrice) {
        this.foodPrice = foodPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tra_foods.food_message
     *
     * @return the value of tra_foods.food_message
     *
     * @mbggenerated Thu May 03 20:24:11 CST 2018
     */
    public String getFoodMessage() {
        return foodMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tra_foods.food_message
     *
     * @param foodMessage the value for tra_foods.food_message
     *
     * @mbggenerated Thu May 03 20:24:11 CST 2018
     */
    public void setFoodMessage(String foodMessage) {
        this.foodMessage = foodMessage;
    }
}