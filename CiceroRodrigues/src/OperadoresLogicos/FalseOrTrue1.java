package OperadoresLogicos;

import javax.swing.JOptionPane;

public class FalseOrTrue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean a = true, b = false, c = false, d = true, e = false, f = true, g = false;
		
		boolean qa, qb, qc, qd, qe, qf, qg, qh, qi, qj, qk, ql, qm, qn, qo, qp, qq, qr;
		
		qa = (a||b)&&(e&&g) ;
		qb = (a&&b&&c)||(d&&e&&f);
		qc = a&&b||c||d&&e||f;
		qd = !(a&&b)||!(e||f||g);
		qe = !(((((a&&b)||c)&&d)||e)&&f);
		qf = (a&&e)^(!d||!f);
		qg = (a&&!b&&!d&&e&&!f);
		qh = !(!(a^b)||(!c||!d));
		qi = !a||a&&(b||c)&&d||e&&f;
		qj = !a||!b||!c||!d||!e&&f;
		qk = a&&b&&c&&d&&e&&f&&g;
		ql = !(!(!(!(!a))));
		qm = (!a&&d||!c)!=(d&&e||f)||!g;
		qn = g&&a||c&&(a||!c||!d);
		qo = !e&&b||g&&a&&!d||f;
		qp = !b&&b||!a||a;
		qq = !(a&&b)==(!a||!b);
		qr = !(a||b)==(!a&&!b);
		
		JOptionPane.showMessageDialog(null,"a: " + qa + "\nb: " + qb + "\nc: " + qc + "\nd: " + qd 
				+ "\ne: " + qe + "\nf: " + qf + "\ng: " + qg + "\nh: " + qh + "\ni: " + qi + " \nj: " +
				qj + "\nk: " + qk + "\nl: " + ql + "\nm: " + qm + "\nn: " + qn + "\no: " + qo + 
				"\np: " + qp + "\nq: " + qq + "\nr: " + qr);
				
	}

}
