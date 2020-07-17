package e.module02.lecture09;

enum AcademicRank {
		ASSISTANT_PROFESSOR (1234.5),
		SENIOR_ASSISTANT_PROFESSOR (345.9),
		DOCENT (234.3),
		PROFESSOR (3232.2);
	
		private final double salary;
		
		AcademicRank(double salary) {
			this.salary = salary;
		}

		public double getSalary() {
			return this.salary;
		}
}