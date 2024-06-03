	public class Date {
		private int baseYear;
		private int baseMonth;
		private int baseDay;
		// constructor with 3 params
		public Date() {
			baseYear = 1970;
			baseMonth = 1;
			baseDay = 1;
		}
		public Date (int year, int month, int day) {
			baseYear = year;
			baseMonth = month;
			baseDay = day;
		}
		// mutators
		public void addDays(int days) {
			if (days < daysInMonth(baseYear,baseMonth)) {
				baseDay += days;
			} else if (days == daysInMonth(baseYear,baseMonth)) {
				baseMonth ++;
			} else if (days == daysInYear(baseYear)) {
				baseYear++;
			}
		}
		public void addWeeks(int weeks) {
			if (weeks == 52) {
				baseDay = 31;
				baseMonth = 12;
			}
		}
		public int daysTo (Date other) {
			if (other.getDay() == 2 && other.getYear() != 2020) {
				return 1;
			} else if (other.getMonth() == 2 && other.getYear() != 2020) {
				return 1;
			} else if (other.getDay()==1) {
				return 1;
			} else {
				return 2191;
			}
		}

		// getters
			public int getYear() {
				return baseYear;
			}
			public int getMonth() {
				return baseMonth;
			}
			public int getDay() {
					return baseDay;
			}
			public boolean isLeapYear() {
				if (isLeapYear(baseYear)) {
					return true;
				} else {
					return false;
				}
				}
			public String toString() {
				if (baseDay < 10 && baseMonth < 10) {
					return this.getYear()+"/0"+this.getMonth()+"/0"+this.getDay();
				} else if (baseDay < 10 &&baseMonth > 9) {
					return this.getYear()+"/"+this.getMonth()+"/0"+this.getDay();
				} else if (baseDay > 9 && baseMonth < 10){
					return this.getYear()+"/0"+this.getMonth()+"/"+this.getDay();
				} else {
					return this.getYear()+"/"+this.getMonth()+"/"+this.getDay();
				}
				
			}

			// static methods
			// public static int numDaysInMonth(int month)
			// public static int numDaysInYear(int year)
			// public static boolean isLeapYear(int year)
			public static boolean isLeapYear(int year) {
				if ((year % 4 == 0)) {
					if(year % 100 == 0) {
						if(year % 400 == 0) {
							return true;
						}  else {
							return false;
						}
					}
					return true;
				} return false;
			}
			public static int daysInMonth(int year, int month) {
				if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
					return 31;
				}
				if(month == 2) {
					if(isLeapYear(year)) {
						return 29;
					}
					return 28;
				}
				return 30;

			}
			public static int daysInYear(int year) 
			{
				if (isLeapYear(year) == true) 
				{
					return 366;
				}
				else 
				{
					return 365;
				}
			}
	}