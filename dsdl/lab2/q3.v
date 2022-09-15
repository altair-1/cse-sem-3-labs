module q3(a,b,c,d,f);
input a,b,c,d;
output f;
and(k1,b,c,d);
and(k2,a,c,d);
and(k3,a,b,d);
and(k4,a,b,c);
or(f,k1,k2,k3,k4);
endmodule

