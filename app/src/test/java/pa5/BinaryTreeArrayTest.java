
package pa5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BinaryTreeArrayTest {
    @Test
    void testInsert(){
        BinaryTreeArray tree = new BinaryTreeArray(10);
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
        tree.insert(10);
        assertEquals("1 2 3 4 5 6 7 8 9 10 ", tree.levelOrder());
    }
    @Test
    void testInsertAndLevelOrder() {
        BinaryTreeArray tree = new BinaryTreeArray(10);
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        
        
        assertEquals("10 20 30 ", tree.levelOrder());
    }

    @Test
    void testInOrderTraversal() {
        BinaryTreeArray tree = new BinaryTreeArray(10);
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        
        
        assertEquals("40 20 50 10 30 ", tree.inOrder());
    }

    @Test
    void testPreOrder() {
        BinaryTreeArray tree = new BinaryTreeArray(10);
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        
        
        assertEquals("10 20 30 ", tree.preOrder());
    }

    @Test
    void testPostOrder() {
        BinaryTreeArray tree = new BinaryTreeArray(10);
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        
        
        assertEquals("20 30 10 ", tree.postOrder());
    }

    @Test
    void testLongest() {
        BinaryTreeArray tree = new BinaryTreeArray(10);
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(60);
        tree.insert(70);
        
        
        assertEquals(2, tree.longestPath());
    }

    @Test
    void testDelete() {
        BinaryTreeArray tree = new BinaryTreeArray(10);
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.delete(20);    
        assertEquals("10 30 ", tree.levelOrder());
        
        tree.delete(99);
        assertEquals("10 30 ", tree.levelOrder());
    }

    @Test
    void testDeleteInvalid() {
        BinaryTreeArray tree = new BinaryTreeArray(10);
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);        
        tree.delete(99);
        
    }
    @Test
    void testInsertOverflow() {
        BinaryTreeArray tree = new BinaryTreeArray(3);
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4); 
        assertEquals("1 2 3 ", tree.levelOrder());
    }

    @Test
    void testDeleteRoot() {
        BinaryTreeArray tree = new BinaryTreeArray(10);
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.delete(10);
        assertEquals("30 20 ", tree.levelOrder());
    }

    @Test
    void testDeleteLeaf() {
        BinaryTreeArray tree = new BinaryTreeArray(10);
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.delete(40);
        assertEquals("10 20 30 ", tree.levelOrder());
    }

    @Test
    void testLongestPathSingle() {
        BinaryTreeArray tree = new BinaryTreeArray(10);
        tree.insert(10);
        assertEquals(0, tree.longestPath());
    }

    @Test
    void testLongestPathEmpty() {
        BinaryTreeArray tree = new BinaryTreeArray(10);
        assertEquals(0, tree.longestPath());
    }
}
