module q1(a,b,c,d,f1,f11,f2,f22);
input a,b,c,d;
output f1,f11,f2,f22;
assign f1=(~a&b)|(b&~c&~d)|(c&d)|(~b&c);
assign f2=(b&~c&~d)|(~b&d)|(~b&c);
and(k1,~a,b);
and(k2,c,d);
and(k3,~b,c);
and(k4,b,~c,~d);
or(f11,k1,k2,k3,k4);
and(n1,b,~c,~d);
and(n2,~b,d);
and(n3,~b,c);
or(f22,n1,n2,n3);
endmodule

