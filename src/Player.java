public class Player {
	public String name, gender;
	public Pokemon main, p2, p3, p4, p5, p6;
	public Pokedex pokedex;
        public Bag bag;
	public int money; 
        public boolean badge1, badge2, badge3, badge4, badge5, badge6, badge7, badge8;
	public int hof_ribbon, star_ribbon, pokedex_ribbon;
	public String bigFront, bigBack;
	public String front1, front2, front3, back1, back2, back3, left1, left2, left3, right1, right2, right3;
        
        public float speed = 60;
        //location 
        public float playerX;
        public float playerY;
	
        public Player() {
            this.name = null;
            this.gender = null;
            this.money = 0;
            
            this.pokedex = new Pokedex();
            this.bag = new Bag();
            
            this.main = null;
            this.p2 = null;
            this.p3 = null;
            this.p4 = null;
            this.p5 = null;
            this.p6 = null; 
            
            this.badge1 = false;
            this.badge2 = false;
            this.badge3 = false;
            this.badge4 = false;
            this.badge5 = false;
            this.badge6 = false;
            this.badge7 = false;
            this.badge8 = false;
            
            this.hof_ribbon = 0;
            this.star_ribbon = 0;
            this.pokedex_ribbon = 0;
            
            this.bigFront = "";
            this.bigBack = "";
            this.front1 = "";
            this.front2 = "";
            this.front3 = "";
            this.back1 = "";
            this.back2 = "";
            this.back3 = "";
            this.left1 = "";
            this.left2 = "";
            this.left3 = "";
            this.right1 = "";
            this.right2 = "";
            this.right3 = "";
        }
        
        /*
        from a save state        
        public Player(String data) {
		//basic player information
		this.name = data[];
		this.gender = data[];
		this.money = Integer.parseInt(data[]);

		this.pokedex = new Pokedex();

		//Current Pokemon information
		this.main = new Pokemon(data[]);
		this.p1 = new Pokemon(data[]);
		this.p2 = new Pokemon(data[]);
		this.p3 = new Pokemon(data[]);
		this.p4 = new Pokemon(data[]);
		this.p5 = new Pokemon(data[]);

		//gym badge information
		this.badge1 = Integer.parseInt(data[]);
		this.badge2 = Integer.parseInt(data[]);
		this.badge3 = Integer.parseInt(data[]);
		this.badge4 = Integer.parseInt(data[]);
		this.badge5 = Integer.parseInt(data[]);
		this.badge6 = Integer.parseInt(data[]);
		this.badge7 = Integer.parseInt(data[]);
		this.badge8 = Integer.parseInt(data[]);

		//ribbons
		this.hof_ribbon = Integer.parseInt(data[]);
		this.star_ribbon = Integer.parseInt(data[]);
		this.pokedex_ribbon = Integer.parseInt(data[]);

		//image and sprites
		this.bigFront = data[];
		this.bigBack = data[];
		this.front1 = data[];
		this.front2 = data[];
		this.front3 = data[];
		this.back1 = data[];
		this.back2 = data[];
		this.back3 = data[];
		this.left1 = data[];
		this.left2 = data[];
		this.left3 = data[];
		this.right1 = data[];
		this.right2 = data[];
		this.right3 = data[];
	}

	//overload constructor to make a streamlined char that the computer plays. 
	public Player(String data, boolean gamePlayed) {
		
		if(gamePlayed == false) {
			System.out.println("Error. Attempted to overload constructor PLAYER,");
			System.out.println("with playable character. Please review structure");
			System.out.println("and try again.");
			System.exit(0);
		}

		this.name = data[];
		this.gender = data[];
		this.money = Integer.parseInt(data[]);

		this.main = new Pokemon(data[]);
		this.p1 = new Pokemon(data[]);
		this.p2 = new Pokemon(data[]);
		this.p3 = new Pokemon(data[]);
		this.p4 = new Pokemon(data[]);
		this.p5 = new Pokemon(data[]);

		this.bigFront = data[];
		this.bigBack = data[];
		this.front1 = data[];
		this.front2 = data[];
		this.front3 = data[];
		this.back1 = data[];
		this.back2 = data[];
		this.back3 = data[];
		this.left1 = data[];
		this.left2 = data[];
		this.left3 = data[];
		this.right1 = data[];
		this.right2 = data[];
		this.right3 = data[];
	}
        */
}