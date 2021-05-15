package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenFromC1ToG5thenD2E3F4G5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] excepted = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertArrayEquals(excepted, bishopBlack.way(Cell.G5));
    }

    @Test
    public void whenFromA1ToH8thenB2C3D4E5F6G7H8() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell[] excepted = {Cell.B2, Cell.C3, Cell.D4, Cell.E5, Cell.F6, Cell.G7, Cell.H8};
        Assert.assertArrayEquals(excepted, bishopBlack.way(Cell.H8));
    }

    @Test
    public void whenFromH8ToA1thenG7F6E5D4C3B2A1() {
        BishopBlack bishopBlack = new BishopBlack(Cell.H8);
        Cell[] excepted = {Cell.G7, Cell.F6, Cell.E5, Cell.D4, Cell.C3, Cell.B2, Cell.A1};
        Assert.assertArrayEquals(excepted, bishopBlack.way(Cell.A1));
    }

    @Test
    public void whenFromH1ToA8thenG2F3E4D5C6B7A8() {
        BishopBlack bishopBlack = new BishopBlack(Cell.H1);
        Cell[] excepted = {Cell.G2, Cell.F3, Cell.E4, Cell.D5, Cell.C6, Cell.B7, Cell.A8};
        Assert.assertArrayEquals(excepted, bishopBlack.way(Cell.A8));
    }

    @Test
    public void whenFromA8ToH1thenB7C6D5E4F3G2H1() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A8);
        Cell[] excepted = {Cell.B7, Cell.C6, Cell.D5, Cell.E4, Cell.F3, Cell.G2, Cell.H1};
        Assert.assertArrayEquals(excepted, bishopBlack.way(Cell.H1));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenNotDiagonalThen() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A8);
        bishopBlack.way(Cell.A4);
    }

    @Test
    public void whenIsDiagonalTrue() {
        assertTrue(new BishopBlack(Cell.C1).isDiagonal(Cell.C1, Cell.G5));
    }

    @Test
    public void whenIsDiagonalFalse() {
        assertFalse(new BishopBlack(Cell.C1).isDiagonal(Cell.C1, Cell.G6));
    }
}