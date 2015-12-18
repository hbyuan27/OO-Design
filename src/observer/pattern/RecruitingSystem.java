package observer.pattern;

import observer.pattern.factory.DevPositionFactory;
import observer.pattern.factory.ProductPositionFactory;
import observer.pattern.factory.QualityPositionFactory;
import observer.pattern.factory.simple.PositionSimpleFactory;
import observer.pattern.position.IPosition;
import observer.pattern.position.PositionType;
import observer.pattern.user.Candidate;
import observer.pattern.user.HR;
import observer.pattern.user.Manager;

public class RecruitingSystem {

	public static void main(String[] args) {

		/**
		 * create candidates, manager and hr
		 */
		System.out.println("***** Start Creating Users *****");
		Candidate c1 = new Candidate("Jack");
		Candidate c2 = new Candidate("Mary");
		System.out.println();

		Manager m1 = new Manager("John");
		Manager m2 = new Manager("Nancy");
		System.out.println();

		HR h1 = new HR("Lily");
		HR h2 = new HR("Tony");
		System.out.println();

		System.out.println("***** Start Creating Positions *****");
		/**
		 * create job positions using Simple Factory Pattern
		 */
		IPosition javaDev1 = PositionSimpleFactory.create(PositionType.JAVADEV);
		javaDev1.setManager(m1);
		javaDev1.setHR(h1);
		System.out.println();

		IPosition testing1 = PositionSimpleFactory.create(PositionType.TESTING);
		testing1.setManager(m2);
		testing1.setHR(h2);
		System.out.println();

		IPosition pm1 = PositionSimpleFactory.create(PositionType.PM);
		pm1.setManager(m1);
		pm1.setHR(h2);
		System.out.println();

		/**
		 * alternative solution: create job positions using Factory Pattern
		 */
		DevPositionFactory devPositionFactory = new DevPositionFactory();
		IPosition javaDev2 = devPositionFactory.create(PositionType.JAVADEV);
		javaDev2.setManager(m1);
		javaDev2.setHR(h1);

		QualityPositionFactory qualityPositionFactory = new QualityPositionFactory();
		IPosition testing2 = qualityPositionFactory.create(PositionType.TESTING);
		testing2.setManager(m2);
		testing2.setHR(h2);

		ProductPositionFactory productPositionFactory = new ProductPositionFactory();
		IPosition pm2 = productPositionFactory.create(PositionType.PM);
		pm2.setManager(m1);
		pm2.setHR(h2);
		System.out.println();

		/**
		 * candidate applies a job position, manager & HR received notifications
		 */
		System.out.println("***** Start Applying Positions *****");
		System.out.println(c1.getUserName() + " is applying position: " + javaDev1.getName());
		c1.applyPosition(javaDev1);
		System.out.println();
		System.out.println(c2.getUserName() + " is applying position: " + testing1.getName());
		c2.applyPosition(testing1);
		System.out.println();

		System.out.println(c1.getUserName() + " is applying position: " + javaDev2.getName());
		c1.applyPosition(javaDev2);
		System.out.println();
		System.out.println(c2.getUserName() + " is applying position: " + testing2.getName());
		c2.applyPosition(testing2);
	}

}
