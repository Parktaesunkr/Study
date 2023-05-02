package tr0502;

public class Id {

		static int counter =0;
		private int id;
		public Id() {
			this.id = ++counter;
		}
		public int getId() {
			return id;
		}
				
}
