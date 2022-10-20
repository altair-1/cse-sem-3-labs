`timescale 1ns/1ns
`include "q3.v"

module q3_tb();
reg [15:0] w;
reg [3:0] s;
wire f;

q3 mux(w,s,f);
initial 
begin 
    $dumpfile("q3_tb.vcd");
    $dumpvars(0,q3_tb);

    w = 16'b0000000000000001; s = 4'b0000;#20;
    w = 16'b1000000000000000; s = 4'b1111;#20;
    w = 16'b0000000000000100; s = 4'b0010;#20;
    w = 16'b0010000000000000; s = 4'b1101;#20;

    $display("test complete");

end
endmodule

