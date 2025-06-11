package com.abhi_prep.practice.FactoryPttern;

import java.util.Scanner;

// Abstract Factory Interface
interface PlanFactory {
    Plans createPlan();
}

// Abstract Plan Class
abstract class Plans {
    protected double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println("Bill amount for " + units + " units: " + rate * units);
    }
}

// Concrete Plan Classes
class DomesticPlans extends Plans {
    @Override
    public void getRate() {
        rate = 5.5;
    }
}

class CommercialPlans extends Plans {
    @Override
    public void getRate() {
        rate = 6.2;
    }
}

// Concrete Factory Classes
class DomesticPlanFactory implements PlanFactory {
    @Override
    public Plans createPlan() {
        return new DomesticPlans();
    }
}

class CommercialPlanFactory implements PlanFactory {
    @Override
    public Plans createPlan() {
        return new CommercialPlans();
    }
}

// Factory Provider Class
class GetPlansFactory {
    public PlanFactory getPlanFactory(String planType) {
        if (planType.equalsIgnoreCase("CommercialPlans")) {
            return new CommercialPlanFactory();
        } else if (planType.equalsIgnoreCase("DomesticPlans")) {
            return new DomesticPlanFactory();
        }
        return null;
    }
}

// Main Class
public class AbsFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter plan Type & units: ");
        String planType = sc.next();

        GetPlansFactory factory = new GetPlansFactory();
        PlanFactory planFactory = factory.getPlanFactory(planType);

        if (planFactory != null) {
            Plans plan = planFactory.createPlan();

            int units = sc.nextInt();

            plan.getRate();
            plan.calculateBill(units);
        } else {
            System.out.println("Invalid plan type.");
        }

        sc.close();
    }
}

