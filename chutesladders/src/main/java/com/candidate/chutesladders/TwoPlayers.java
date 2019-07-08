package com.candidate.chutesladders;

public class TwoPlayers {

	Player p1 = new Player();

	Player p2 = new Player();
	Chutes c = new Chutes();
	Ladders l = new Ladders();

	int randNumber() {

		int dice[] = { 1, 2, 3, 4, 5, 6 };

		return dice[(int) (Math.random() * 6)];
	}

	void gameStart() {

		p1.setName("Eric");
		p1.setNloc(0);
		p1.setLoc(0);
		p2.setName("Paul");
		p2.setNloc(0);
		p2.setLoc(0);
		int count = 0;
		while (p1.getNloc() <= 100 && p2.getNloc() <= 100) {

			/* Player 1 Turn */
			int temp = p1.getNloc();
			p1.setNloc(p1.getNloc() + randNumber());
			if (p1.getNloc() > 100) {
				p1.setNloc(temp);
				p1.setLoc(temp);
			} 
			else if (p1.getNloc() == 100) {
				System.out.println(" The Winner is " + p1.getName());
				break;
			} 
			else {
				p1.setLoc(temp);
			}
			count++;
			int ccheck = c.chutes(p1.getNloc());
			int lcheck = l.ladder(p1.getNloc());
			if (ccheck == 0) {

				if (lcheck == 0) {
					System.out.println(count + "." + p1.getName() + ": " + p1.getLoc() + " --> " + p1.getNloc());
				} 
				else if (lcheck==100) {
					System.out.println(count + "." + p1.getName() + ": " + p1.getLoc() + " --> " + p1.getNloc()
					+ " --LADDER-->" + lcheck);
					System.out.println("The winner is "+p1.getName());
					break;
				}
			else {
					System.out.println(count + "." + p1.getName() + ": " + p1.getLoc() + " --> " + p1.getNloc()
							+ " --LADDER-->" + lcheck);
					p1.setNloc(lcheck);
					p1.setLoc(lcheck);

				}
			}
			else {
				System.out.println(count + "." + p1.getName() + ": " + p1.getLoc() + " --> " + p1.getNloc()
						+ " --CHUTE-->" + ccheck);
				p1.setNloc(ccheck);
				p1.setLoc(ccheck);
			}
			/* Player 2 Turn */
			temp = p2.getNloc();
			p2.setNloc(p2.getNloc() + randNumber());
			if (p2.getNloc() > 100) {
				p2.setNloc(temp);
				p2.setLoc(temp);

			}
			else if (p2.getNloc() == 100) {

				System.out.println("The Winner is " + p2.getName());
				break;
			} else {
				p2.setLoc(temp);
			}
			count++;
			
			ccheck = c.chutes(p2.getNloc());
			lcheck = l.ladder(p2.getNloc());

			if (ccheck == 0) {

				if (lcheck == 0) {
					System.out.println(count + "." + p2.getName() + ": " + p2.getLoc() + " --> " + p2.getNloc());
				} 
				
				else if (lcheck==100) {

					System.out.println(count + "." + p2.getName() + ": " + p2.getLoc() + " --> " + p2.getNloc()
							+ " --LADDER-->" + lcheck);
					System.out.println("The winner is "+p2.getName());
					break;
				}
			else {
					System.out.println(count + "." + p2.getName() + ": " + p2.getLoc() + " --> " + p2.getNloc()
							+ " --LADDER-->" + lcheck);
					p2.setNloc(lcheck);
					p2.setLoc(lcheck);

				}
			}
			
		else {
				System.out.println(count + "." + p2.getName() + ": " + p2.getLoc() + " --> " + p2.getNloc()	+ " --CHUTE-->" + ccheck);
				p2.setNloc(ccheck);
				p2.setLoc(ccheck);
			}
		}

	}

}
