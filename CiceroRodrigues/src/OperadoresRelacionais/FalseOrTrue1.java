package OperadoresRelacionais;

import javax.swing.JOptionPane;

public class FalseOrTrue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ra, rb, rc, rd, re, rf, rg, rh, ri, rj, rk, rl, rm, rn, ro, rp, rq, rr, rs, rt, ru, rv, rw;
		
		int a = 2, b = 5, c = 7, d = 1, e = 0, f = 10, g = 1;
		
		ra = a > b;
		rb = b < c;
		rc = d >= g;
		rd = e <= f;
		re = e == f;
		rf = d != a;
		rg = d == g;
		rh = a >= c;
		ri = c >= f;
		rj = c <= e;
		rk = a > g;
		rl = d < f;
		rm = a != c;
		rn = a > 5;
		ro = 6 < g;
		rp = 10 > d;
		rq = 5 + b < 3 + g;
		rr = c + 2 >= 7 - a;
		rs = d + e - f + 2 <= b + c - g;
		rt = d * 2 + 3 != c + e;
		ru = -b + a * c == g * f * e;
		rv = f / 2 * g < -d + a * 2;
		rw = a + b - -c > -g + 2 * f;
		
		JOptionPane.showMessageDialog(null, "a: " + ra + " b: " + rb + " c: " + rc + " d: " + rd +
				" e: " + re + " f: " + rf + " g: " + rg + " h: " + rh + " i: " + ri + " j: " + rj + " k: " +
				rk + " l: " + rl + " m: " + rm + " n: " + rn + " o: " + ro + " p: " + rp + " q: " + rq + " r: " + rr + 
				" s: " + rs + " t: " + rt + " u: " + ru + " v: " + rv + " w: " + rw);
		
	}

}
