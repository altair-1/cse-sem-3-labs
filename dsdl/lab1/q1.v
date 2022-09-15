module q1(a, b, c,d, m);

input a, b,c,d;
output m;

and (g, a, b);
and (f, a,b);
or (h,g,c);
not (j,h);
and (k,j,d);
or (i,c,f);
or (l,d,i);
and(m,l,k);

endmodule
