module q2( a,b,c,d,k1,k2,k3,k4);
input a,b,c,d;
output k1,k2,k3,k4;
assign k1=(b|c)&(~b|d);
assign k3=(a|~c|d)&(b|~c|d)&(a|~b|~d)&(~b|c|d);
or(f1,b,c);
or(f2,~b,d);
and(k2,f1,f2);
or(f3,a,~c,d);
or(f4,b,~c,d);
or(f5,a,~b,~d);
or(f6,~b,c,d);
and(k4,f3,f4,f5,f6);
endmodule

