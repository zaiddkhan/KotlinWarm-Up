package bs_medium

class Node(var `val`: Int) {
         var left: Node? = null
         var right: Node? = null
       var next: Node? = null
     }


fun connect(root: Node?): Node? {
    var curr = root
    var next = root?.left ?: null // This tracks the first node of the next level

    while (curr != null && next != null) {
        // Iterate over the current level
        while (curr != null) {
            // Connect left child to right child
            curr.left?.next = curr.right

            // Connect right child to the left child of the next node in the current level
            if (curr.next != null) {
                curr.right?.next = curr.next?.left
            }

            // Move to the next node in the current level
            curr = curr.next
        }

        // Move to the next level
        curr = next
        next = curr?.left
    }

    return root // Return the root after connections are made
}