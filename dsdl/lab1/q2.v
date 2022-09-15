module q2(a, b, c,d, m);
input a, b,c,d;
output m;

assign m =((~((a & b) |c))&d) & (((a&b)|c)|d);

endmodule
