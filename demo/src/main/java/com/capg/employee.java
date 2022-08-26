package com.capg;

public class employee {

		// TODO Auto-generated method stub
		private String ename;
		private int reg;
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public int getReg() {
			return reg;
		}
		public void setReg(int reg) {
			this.reg = reg;
		}
		@Override
		public String toString() {
			return "employee [ename=" + ename + ", reg=" + reg + "]";
		}


}
