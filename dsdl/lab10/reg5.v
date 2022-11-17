module reg5(inp,clk,reset,o);
    input [4:0] inp;
    input clk,reset;
    output [4:0] o;

    dff ff1(inp[4],clk,reset,o[4]);
    dff ff2(inp[3],clk,reset,o[3]);
    dff ff3(inp[2],clk,reset,o[2]);
    dff ff4(inp[1],clk,reset,o[1]);
    dff ff5(inp[0],clk,reset,o[0]);

endmodule

module dff(d,clk,reset,q);
    input d,clk,reset;
    output reg q;

    always @(posedge clk)
        if (!reset)
            q <= d;

    always @(reset)
        if (reset)
            q <= 0;

endmodule
